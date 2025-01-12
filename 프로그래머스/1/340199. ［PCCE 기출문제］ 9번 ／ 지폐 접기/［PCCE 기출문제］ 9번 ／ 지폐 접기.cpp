#include <string>
#include <vector>

using namespace std;

int solution(vector<int> wallet, vector<int> bill) {
    int answer = 0;
    int bill_min, bill_max, w_min, w_max;
    
    if (wallet[0] > wallet[1]) {
        w_max = wallet[0];
        w_min = wallet[1];
    } else {
        w_max = wallet[1];
        w_min = wallet[0];
    }
    
    while(1) {
        if (bill[0] > bill[1]) {
            bill_max = bill[0];
            bill_min = bill[1];
            bill[0] /= 2;
        } else {
            bill_max = bill[1];
            bill_min = bill[0];
            bill[1] /= 2;
        }
        
        if (bill_min <= w_min && bill_max <= w_max) {
            break;
        }
        answer++;
    }
    return answer;
}