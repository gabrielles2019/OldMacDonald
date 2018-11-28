class Chick extends Animal {     
    private String myType, mySound;
    public Chick(String type, String sound) {
      super("chick","cluck");
      this.otherSound = "pee";
    }
    public String getSound() {
     if (Math.random() < 0.5)
         return super.getSound();
     else
         return otherSound;
    }
}
