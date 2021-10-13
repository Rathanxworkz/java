class NewsPaper{
  String name=null; 
  NewsPaperLang lang=NewsPaperLang.KANNADA;
  int noOfPages;
  float price;
  String headline;
   NewsPaper(String name,float price)
   {
    this();
    this.price=price
    System.out.println("invoked string,flaor Constructor of news paper");
   }
   NewsPaper()
   {
     System.out.println("invoked no-arg Constructor of news paper");
     this.name="NA";
     this.price=1.0f;
   }
  
NewsPaper(String name)
    {
      this.name=name;
      System.out.println("invoked string Constructor of news paper");
    }

NewsPaper(float price)
{
  this.price=price;
      System.out.println("invoked float Constructor of news paper");
}


}