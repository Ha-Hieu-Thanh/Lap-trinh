#include <bits/stdc++.h>
using namespace std;
using namespace std::chrono;
int bruteforce(vector<int> A, int n){
    int max = INT_MIN;
    for (int i = 0; i < n; i++)
        for (int j = i; j < n; j++){
            int sum = 0;
            for (int k = i; k <= j; k++)
                sum += A[k];
            if (sum > max)
                max = sum;
        }   
    return max;
}
int bruteforce_better(vector<int> A, int n){
    int max = INT_MIN;
    for (int i = 0; i < n; i++){
        int sum = 0;
        for (int j = i; j < n; j++){
            sum += A[j];
            if (sum > max)
                max = sum;
        }
    }
    return max;
}
int dynamic(vector<int> A, int n){
    int e = 0;
    int s = INT_MIN;
    for (int i = 0; i < n; i++){
        e = max(A[i], e + A[i]);
        s = max(e, s);
    }
    return s;
}
vector<int> get_randomvector(int m){
    vector<int> arr(m);
    for (int i = 0; i<m; i++)
        arr[i] = (rand() % 200)-100;
    return arr;
}
class Algo
{
    public:
        string name;
        vector<long long> time;
        Algo(string names, vector<long long> times){
            name = names;
            time = times;
        }
};
int main() {
    long long size_of_array[3] = {1000, 10000, 100000};
    int n = 3;
    vector<long long> bf_time(3), bb_time(3), dynamic_time(3);
    vector<vector<int>> A;
    for (int i = 0; i < 3; i++){
        A.push_back(get_randomvector(size_of_array[i]));
    }
    // Brute Force
    for (int i = 0; i < 3; i++){
        int m = size_of_array[i];
        auto start = high_resolution_clock::now();
        bruteforce(A[i], m);
        auto duration = high_resolution_clock::now() - start;
        long long microseconds = duration_cast<nanoseconds>(duration).count();
        bf_time[i] = microseconds;
    }
    // Brute Force better
    for (int i = 0; i < 3; i++){
        int m = size_of_array[i];
        auto start = high_resolution_clock::now();
        bruteforce_better(A[i], m);
        auto duration = high_resolution_clock::now() - start;
        long long microseconds = duration_cast<nanoseconds>(duration).count();
        bb_time[i] = microseconds;
    }    
    // Dynamic Programming
    for (int i = 0; i < 3; i++){
        int m = size_of_array[i];
        auto start = high_resolution_clock::now();
        dynamic(A[i], m);
        auto duration = high_resolution_clock::now() - start;
        long long microseconds = duration_cast<nanoseconds>(duration).count();
        dynamic_time[i] = microseconds;
    }
    Algo algorithm[3] = {Algo("Brute force", bf_time), Algo("Brute force better", bb_time), Algo("Dynamic programming", dynamic_time)};
    cout
        << left
        << setw(30)
        << "Name"
        << left
        << setw(20)
        << "n=1000"
        << left
        << setw(20)
        << "n=10000"
        << left
        << setw(20)
        << "n=100000"
        << endl;
    for (int i = 0; i < 3; i++){
        cout 
            << left
            << setw(30)
            << algorithm[i].name
            << left
            << setw(20)
            << algorithm[i].time[0]
            << left
            << setw(20)
            << algorithm[i].time[1]
            << left
            << setw(20)
            << algorithm[i].time[2]
            << endl;
    }
}