class Farm { 
  private Animal[] aBunchOfAnimals = new Animal[3];
  public Farm() {
    aBunchOfAnimals[0] = new NamedCow("cow","Liz","moo");
    aBunchOfAnimals[1] = new NamedPig("pig","Muddy","oink");
    aBunchOfAnimals[2] = new NamedChick("chick","Paul","cluck");
  }
   public void animalSounds() {
     for (int nI=0; nI < aBunchOfAnimals.length; nI++) {
       System.out.printIn(aBunchOfAnimals[nI].getType() + "goes" + aBunchOfAnimals[nI].getSound());
   }
   System.out.printIn("The cow is known as " + ((NamedCow)aBunchOfAnimals[0].getName());
   System.out.printIn("The pig is known as " + ((NamedPig)aBunchOfAnimals[1].getName());
   System.out.printIn("The cchick is known as " + ((NamedChick)aBunchOfAnimals[2].getName());
}
}
