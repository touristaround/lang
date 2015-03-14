
public class Mac {
    
    char [] address = new char [6];
    
    public Mac(int i, int j) {
        address[0] = (char)((i >> 16)&0xff);
        address[1] = (char)((i >>  8)&0xff);
        address[2] = (char)( i       &0xff);
        address[3] = (char)((j >> 16)&0xff);
        address[4] = (char)((j >>  8)&0xff);
        address[5] = (char)( j       &0xff);
    }
    
    public String toString() {
        String a = new String();
        a = String.format("%02x:", (int)address[0]) +
            String.format("%02x:", (int)address[1]) +
            String.format("%02x:", (int)address[2]) +
            String.format("%02x:", (int)address[3]) +
            String.format("%02x:", (int)address[4]) +
            String.format("%02x",  (int)address[5])
            ;
        return a;
    }
       
  
    public static void main(String[] args)
    {
        Mac mc = new Mac(43234,1);
        StdOut.println(mc.toString());
    }
}
