class Cow implements Animal {     
    private String myType, mySound;
    public Cow(String type, String sound) {
      myType = "cow";
      mySound = "Mooooooooo!";
    }
    public String getSound() {
      return mySound;
    }
    public String getType() {
      return myType;
    }
}
