public class QuadraticEquation {
    double A, B, C, delta;
    public QuadraticEquation(){
}

    public QuadraticEquation(double A, double B, double C){
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public double getDiscriminant(){
      delta = B*B - 4*A*C;
        return delta;

    }
    public double  getRoot1(){
        return (-B - Math.sqrt(delta))/(2*A);
    }
    public double  getRoot2(){
        return (-B + Math.sqrt(delta))/(2*A);
    }
}
