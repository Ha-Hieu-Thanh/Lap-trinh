import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
 
 import org.graphstream.algorithm.Dijkstra;
 import org.graphstream.graph.Edge;
 import org.graphstream.graph.Graph;
 import org.graphstream.graph.Node;
 import org.graphstream.graph.Path;
 import org.graphstream.graph.implementations.SingleGraph;
 
 // FileSinkImages arguments
public class DijkstraExample{
	public static void main(String[] args) {
 OutputPolicy outputPolicy = OutputPolicy.BY_STEP_OUTPUT;
 String prefix = "prefix\_";
 OutputType type = OutputType.PNG;
 Resolution resolution = Resolutions.HD720;
 
 FileSinkImages fsi = new FileSinkImages( type, resolution );
 
 // Create the source
 
 FileSourceDGS dgs = new FileSourceDGS();
  
 // Optional configuration
 
 fsi.setStyleSheet(
 	"graph { padding: 50px; fill-color: black; }" +
 	"node { fill-color: #3d5689; }" +
 	"edge { fill-color: white; }");
 
 fsi.setOutputPolicy( outputPolicy );
 fsi.setLayoutPolicy( LayoutPolicy.COMPUTED_FULLY_AT_NEW_IMAGE );
 fsi.setHighQuality();
 fsi.addLogo( "path/to/logo", x, y );
  
 // Images production
 
 dgs.addSink( fsi );
  
 fsi.begin(prefix);
 dgs.begin( "path/to/dgs" );
 while( dgs.nextStep() );
 dgs.end();
 fsi.end();
	}
}