package problem3;

public class Data {
private double sum;
private double max;
private int cnt;

void add(int n) {
    this.sum += n;
    ++this.cnt;
    if (n > this.max) {
        this.max = n;
    }

}

double getAverage() {
	if(this.cnt!=0) return this.sum/this.cnt;
	else return 0;
    //return this.cnt != 0 ? this.sum /this.cnt : 0;
}

double getMax() {
    return this.max;
}
}
