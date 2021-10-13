class FilmIndustry{
   String name=null; 
  FilmIndustryLang lang=FilmIndustryLang.KANNADA;
  int noOfFilm;
  float price;
  String title;
   FilmIndustry(String name,int price)
   {
    this();
    this.price=price;
    System.out.println("invoked string,flaor Constructor of Film Industry");
   }
   FilmIndustry()
   {
     System.out.println("invoked no-arg Constructor of Film Industry");
     this.name="NA";
     this.price=111.0f;
   }
  
FilmIndustry(String name)
    {
      this.name=name;
      System.out.println("invoked string Constructor of Film Industry");
    }

FilmIndustry(float price)
{
  this.price=price;
      System.out.println("invoked float Constructor of Film Industry");
}


}