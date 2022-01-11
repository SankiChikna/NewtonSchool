public class towerOfHanoi{
    public static void main(String[] args) {
        int discs = 5;
        noOfWays(discs,'f','s','m');
    }

    static void noOfWays(int discs,char f,char s,char m){
        if(discs == 1){
            System.out.println(f+"  to  "+s);
            return;
        }
        noOfWays(discs-1, f, m, s);
        System.out.println(f+" to "+s);
        noOfWays(discs-1, m,f,s);
    }
}