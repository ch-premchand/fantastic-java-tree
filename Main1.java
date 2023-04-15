class capsule{
    int k,j;
    capsule(){
        this.k=0;
        this.j=0;
    }
    capsule(int k,int j){
        this.k=k;
        this.j=j;
    }
}
public class Main1{
    public static void main(String args[]){
        capsule cap=new capsule();
        capsule cap1=new capsule(1,2);
        System.out.print("no paramter constructor");
        System.out.println(cap.k+" "+cap.j);
        System.out.print(" paramter constructor");
        System.out.println(cap1.k+" "+cap1.j);
        }
}
