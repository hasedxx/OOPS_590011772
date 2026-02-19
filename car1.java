abstract class car1{
    public abstract int compare(String s1, String s2);
}

class num extends car{
    public int compare(String s1, String s2){
        if(s1.equals(s2))
            return 1;
        else
            return 0;
    }
}
class main{
public static void main(String[] args){
    num b = new num();
    int x = b.compare(args[0],args[1]);
}
}
    
