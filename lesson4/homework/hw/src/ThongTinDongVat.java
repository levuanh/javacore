class ThongTinDongVat
{
    public static void main(String arg[])
    {
        String names[] = { "A", "B", "C", "D", "E" };
		String color[] = { "Red", "Green", "BLue", "Yellow", "Black" };
        int legNumber[] = { 2, 4, 4, 4, 2 };
       
        
        for(int i = 0; i < names.length; i++)
        {
            System.out.println( " Dong Vat Ten  " + " co mau long la " + color[i] + " va co so chan lan " + legNumber[i]);
        }    
    }
}