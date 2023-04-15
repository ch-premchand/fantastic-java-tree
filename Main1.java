class capsule{
    int i,j;
    capsule(){
        this.i=0;
        this.j=0;
    }
    capsule(int i,int j){
        this.i=i;
        this.j=j;
    }
}
public class Main1{
    public static void main(String args[]){
        capsule cap=new capsule();
        capsule cap1=new capsule(1,2);
        System.out.print("no paramter constructor");
        System.out.println(cap.i+" "+cap.j);
        System.out.print(" paramter constructor");
        System.out.println(cap1.i+" "+cap1.j);
        }
}