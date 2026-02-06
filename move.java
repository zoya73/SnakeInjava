class move
{
    static void down()
    {
        try
        {
            for(;;)
            {
                System.out.println(".");
                Thread.sleep(500);
                System.out.print("\033[2J \033[?25l");
            }
        }
        catch(Exception e)
        {
            System.out.println("Error: "+e);
        }
    }
    public static void main(String[] args)
    {
        down();
    }
}