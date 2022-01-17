public class Blop extends Monster
{
   public Blop(int r, int c, String[][][] image)
   {
      super("The-Blop", r, c, image, 10, 20, 1, 0, 90, "GLOP", 50);
      setIsSwimmer(true);
      setCanSplit(true);
      setImperviousToBullets(true);
      setSlimeTrail(true);
      setCanEatAll(true);
   
   }
   public Blop(String n, int r, int c, String[][][] image, int sp, int spp, int rt)
   {
      super (n, r, c, image, 10, sp, spp, rt, 90, "GLOP", 50);
      setIsSwimmer(true);
      setCanSplit(true);
      setImperviousToBullets(true);
      setSlimeTrail(true);
      setCanEatAll(true);
      
   }
   public boolean canGrabUnit(String name)
   {
      return true;
   
   }
   
   public void grabUnit(String name)
   {
      super.setClawContents(name);
   }
   public void eatUnit()
   {
      String[] contents = super.getClawContents();
      int index = -1;		//index of claw contents that are full
      if(!contents[0].equals("empty"))
         index = 0;
      else
         if(!contents[1].equals("empty"))
            index = 1;
      if(index >= 0)
      {
         if(super.getHunger() > 0)
            super.setHealth(super.getHealth() + 5 + (int)(Math.random() * 6));
            super.setHunger(super.getHunger()-1);
         
      
      }
   }
   public String reloadingMessage()
   {
      return "Ran out of slime!";
   }


}