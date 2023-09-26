class Hamming
{
    private String s1;
    private String s2;
    private boolean megfelelo;

    public Hamming(String s1, String s2)
    {
        this.s1 = s1;
        this.s2 = s2;

        if(s1.length() == s2.length())
        {
            megfelelo = true;
        }
        else
        {
            megfelelo = false;
        }
    }
    
    public int getHamming()
    {
        if(!megfelelo)
        {
            return -1;
        }
            
        int count = 0;

        for(int i = 0;i < s1.length();++i)
        {
            if(s1.charAt(i) != s2.charAt(i))
            {
                ++count;
            }
        }

        return count;

    }
    
}

public class Main
{
    public static void main(String[] args)
    {
        Hamming ham1 = new Hamming("agde","afd");
        Hamming ham2 = new Hamming("toned","roses");
        Hamming ham3 = new Hamming("toned","toned");
        int hamham1 = ham1.getHamming();
        int hamham2 = ham2.getHamming();
        int hamham3 = ham3.getHamming();
        System.out.println("agde es afd Hamming tavolsaga: " + hamham1);
        System.out.println("toned es roses Hamming tavolsaga: " + hamham2);
        System.out.println("toned es toned Hamming tavolsaga: " + hamham3);
    }
}