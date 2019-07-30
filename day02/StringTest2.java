class StringTest2 {
    public static void main(String[] args) {
        System.out.println("*       *");
        System.out.println('*' + '\t' + '*');
        System.out.println('*' + "\t" + '*');
        System.out.println('*' + '\t' + "*");
        System.out.println('*' + ('\t' + "*"));
        /*
        *       *
        93
        *       *
        51*
        *       *
        */
    }
}
