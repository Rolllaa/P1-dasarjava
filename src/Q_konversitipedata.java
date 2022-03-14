public class Q_konversitipedata {
    public static void main(String[] args) {
        long varLong = 1000000l;
        int varlnt = 23456;
        varLong = (int) varLong;
        varLong = varlnt;
        System.out.println("nilai varLong=" + varLong);
        System.out.println("nilai varLnt=" + varlnt);
        char varChar ='a';
        varlnt = (int) varChar;
        System.out.println("nilai varlnt ('a')=" +varlnt);
        varChar = (char) (varlnt+1);
        System.out.println("nilai varChar= "+ varChar);
        byte varByte= 127;
        varlnt = varByte;
        System.out.println("nilai varlnt (127)=" +varlnt);
        short varShort =(short) varlnt;
        System.out.println("nilai varShort=" + varShort);
        varShort = varByte;
        System.out.println("nilai varShort=" +varShort);
        double vardouble = 3.145256718992022;
        float varFloat =(float)  vardouble;
        System.out.println("nilai vardouble=" + vardouble);
        System.out.println("nilai varFloat=" + varFloat);

    }
}
