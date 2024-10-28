class Gen<T> {
T ob;
Gen(T O) {
ob = O;
}
T getob() {
return ob;
}
void showType() {
System.out.println("Type of T is " + ob.getClass().getName());
}
}

class GenDemo {
public static void main(String args[]) {
Gen<Integer> iob = new Gen<Integer>(76);
iob.showType();
int v = iob.getob();  
System.out.println("Automated value is " + v);
Gen<Double> dob = new Gen<Double>(10.0);
dob.showType();
double u = dob.getob();  
System.out.println("Automated value is " + u);
Gen<Float> fob = new Gen<Float>(20.0f); 
fob.showType();
float y = fob.getob();  
System.out.println("Automated value is " + y);
    }
}
