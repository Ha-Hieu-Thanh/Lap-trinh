import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFormattedTextField;
import javax.swing.JSlider;
import javax.swing.BoxLayout;
import javax.swing.BorderFactory;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.awt.Font;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.image.BufferStrategy;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import java.text.NumberFormat;

public class MainFrame extends JFrame implements PropertyChangeListener,
	    Visualizer.SortedListener,
	   ButtonPanel.SortButtonListener, MyCanvas.VisualizerProvider
{
	public static final long serialVersionUID = 10L;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrame().setVisible(true);
			}
		});
	}

	private static final int WIDTH = 1280, HEIGHT = 720;
	private static final int CAPACITY = 50, FPS = 100;
	private JPanel mainPanel, inputPanel, sliderPanel, inforPanel, inputPanel1;
	private ButtonPanel buttonPanel;
	private JLabel capacityLabel, fpsLabel, timeLabel, compLabel, swapLabel;
	private JFormattedTextField capacityField,fpsField;
	//private JSlider fpsSlider;
	private MyCanvas canvas;
	private Visualizer visualizer;

	public MainFrame()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMaximumSize(new Dimension(WIDTH, HEIGHT + 200));
		setMinimumSize(new Dimension(WIDTH, HEIGHT + 20));
		setPreferredSize(new Dimension(WIDTH, HEIGHT + 20));
		setLocationRelativeTo(null);
		setResizable(false);
		setBackground(ColorManager.BACKGROUND);
		setTitle("Minh Anh's Sorting Visualizer");

		initialize();
	}


	// initialize components
	private void initialize()
	{
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		mainPanel.setBackground(ColorManager.BACKGROUND);
		add(mainPanel);

		// add buttons panel
		buttonPanel = new ButtonPanel(this);
		buttonPanel.setBounds(0, 150, 250, HEIGHT);
		buttonPanel.setBackground(ColorManager.BACKGROUND);
		mainPanel.add(buttonPanel);

		// add canvas
		canvas = new MyCanvas(this);
		int cWidth = WIDTH - 250 - 10;
		int cHeight = HEIGHT - 80;
		canvas.setFocusable(false);
		canvas.setMaximumSize(new Dimension(cWidth, cHeight));
		canvas.setMinimumSize(new Dimension(cWidth, cHeight));
		canvas.setPreferredSize(new Dimension(cWidth, cHeight));
		canvas.setBounds(250, 60, cWidth, cHeight);
		mainPanel.add(canvas);
		pack();


		// sorting visualizer
		visualizer = new Visualizer(CAPACITY, FPS, this);
		visualizer.createRandomArray(canvas.getWidth(), canvas.getHeight());


		// create an input field for capacity
		// labels
		capacityLabel = new JLabel("Capacity");
		capacityLabel.setForeground(ColorManager.TEXT);
		capacityLabel.setFont(new Font(null, Font.BOLD, 15));

		// capacity input fields
		NumberFormat format = NumberFormat.getNumberInstance();
		MyFormatter formatter = new MyFormatter(format);
		formatter.setValueClass(Integer.class);
		formatter.setMinimum(0);
		formatter.setMaximum(200);
		formatter.setAllowsInvalid(false);
		/* importan -> onChange */
		formatter.setCommitsOnValidEdit(true);

		capacityField = new JFormattedTextField(formatter);
		capacityField.setValue(CAPACITY);
		capacityField.setColumns(3);
		capacityField.setFont(new Font(null, Font.PLAIN, 15));
		capacityField.setForeground(ColorManager.TEXT);
		capacityField.setBackground(ColorManager.CANVAS_BACKGROUND);
		capacityField.setCaretColor(ColorManager.BAR_YELLOW);
		capacityField.setBorder(BorderFactory.createLineBorder(ColorManager.FIELD_BORDER, 1));
		capacityField.addPropertyChangeListener("value", this);

		capacityLabel.setLabelFor(capacityField);

		// input panel
		inputPanel = new JPanel(new GridLayout(1, 0));
		inputPanel.add(capacityLabel);
		inputPanel.add(capacityField);
		
		inputPanel.setBackground(ColorManager.BACKGROUND);
		inputPanel.setBounds(25, 20, 170, 30);
		mainPanel.add(inputPanel);


		// create slider for fps
		// label
		fpsLabel = new JLabel("Frames Per Second");
		fpsLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		fpsLabel.setFont(new Font(null, Font.BOLD, 15));	
		fpsLabel.setForeground(ColorManager.TEXT);
		
		// fps capacity
		NumberFormat format1 = NumberFormat.getNumberInstance();
		MyFormatter formatter1 = new MyFormatter(format1);
		formatter1.setValueClass(Integer.class);
		formatter1.setMinimum(0);
		formatter1.setMaximum(200);
		formatter1.setAllowsInvalid(false);
		/* importan -> onChange */
		formatter1.setCommitsOnValidEdit(true);

		fpsField = new JFormattedTextField(formatter);
		fpsField.setValue(FPS);
		fpsField.setColumns(3);
		fpsField.setFont(new Font(null, Font.PLAIN, 15));
		fpsField.setForeground(ColorManager.TEXT);
		fpsField.setBackground(ColorManager.CANVAS_BACKGROUND);
		fpsField.setCaretColor(ColorManager.BAR_YELLOW);
		fpsField.setBorder(BorderFactory.createLineBorder(ColorManager.FIELD_BORDER, 1));
		fpsField.addPropertyChangeListener("value", this);

		fpsLabel.setLabelFor(fpsField);

		inputPanel1 = new JPanel(new GridLayout(1, 0));
		inputPanel1.add(fpsLabel);
		inputPanel1.add(fpsField);
		
		inputPanel1.setBackground(ColorManager.BACKGROUND);
		inputPanel1.setBounds(200, 20, 170, 30);
		mainPanel.add(inputPanel1);


		
	/*	// slider
		fpsSlider = new JSlider(JSlider.HORIZONTAL, 1, 100, FPS);
		fpsSlider.setMajorTickSpacing(100);
		fpsSlider.setMinorTickSpacing(20);
		fpsSlider.setPaintTicks(true);
		fpsSlider.setPaintLabels(true);
		fpsSlider.setPaintTrack(true);
		fpsSlider.setForeground(ColorManager.TEXT);
		fpsSlider.addChangeListener(this);

		// slider panel
		sliderPanel = new JPanel();
		sliderPanel.setLayout(new BoxLayout(sliderPanel, BoxLayout.Y_AXIS));
		sliderPanel.setBackground(ColorManager.BACKGROUND);
		sliderPanel.add(fpsLabel);
		sliderPanel.add(fpsSlider);

		sliderPanel.setBounds(10, 80, 220, 100);
		mainPanel.add(sliderPanel);

	*/
		// statistics
		// elapsed time
		timeLabel = new JLabel("Elapsed Time: 0 ??s");
		timeLabel.setFont(new Font(null, Font.PLAIN, 15));
		timeLabel.setForeground(ColorManager.TEXT_RED);

		// comparisons
		compLabel = new JLabel("Comparisons: 0");
		compLabel.setFont(new Font(null, Font.PLAIN, 15));
		compLabel.setForeground(ColorManager.TEXT_YELLOW);

		// swapping
		swapLabel = new JLabel("Swaps: 0");
		swapLabel.setFont(new Font(null, Font.PLAIN, 15));
		swapLabel.setForeground(ColorManager.TEXT_GREEN);

		// statistics panel
		inforPanel = new JPanel(new GridLayout(1, 0));
		inforPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);
		inforPanel.add(timeLabel);
		inforPanel.add(compLabel);
		inforPanel.add(swapLabel);
		inforPanel.setBackground(ColorManager.BACKGROUND);
		inforPanel.setBounds(410, 20, 800, 30);
		mainPanel.add(inforPanel);
	}


	/* IMPLEMENTED METHODS */

	// the capacity is changed
	public void propertyChange(PropertyChangeEvent e)
	{
		// update capacity
		int value = ((Number)capacityField.getValue()).intValue();
		visualizer.setCapacity(value);
		int value1 = ((Number)fpsField.getValue()).intValue();
		visualizer.setFPS(value1);
	}


	/*
	// the speed (fps) is changed
	public void stateChanged(ChangeEvent e)
	{
		if (!fpsSlider.getValueIsAdjusting())
		{
			int value = (int) fpsSlider.getValue();
			visualizer.setFPS(value);
		}
	}

	*/
	

	// button clicked
	public void sortButtonClicked(int id)
	{
		switch (id)
		{
			case 0:  // create button
				visualizer.createRandomArray(canvas.getWidth(), canvas.getHeight());
				break;
			case 1:  // bubble button
				visualizer.bubbleSort();
				break;
			case 2:  // selection button
				visualizer.selectionSort();
				break;
			case 3:  // insertion button
				visualizer.insertionSort();
				break;
			case 4:  // quick button
				visualizer.quickSort();
				break;
			case 5:  // merge button
				visualizer.mergeSort();
				break;
		}
	}


	// draw the array
	public void onDrawArray()
	{
		if (visualizer != null)
			visualizer.drawArray();
	}


	// showing statistics when sorting is completed
	public void onArraySorted(long elapsedTime, int comp, int swapping)
	{
		timeLabel.setText("Elapsed Time: " + (int)(elapsedTime/1000.0) + " ??s");
		compLabel.setText("Comparisons: " + comp);
		swapLabel.setText("Swaps: " + swapping);
	}


	// return the graphics for drawing
	public BufferStrategy getBufferStrategy()
	{
		BufferStrategy bs = canvas.getBufferStrategy();
		if (bs == null)
		{
			canvas.createBufferStrategy(2);
			bs = canvas.getBufferStrategy();
		}

		return bs;
	}
}
