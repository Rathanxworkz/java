class FilmIndustryStarter{

public static void main(String[] holidays)
{

FilmIndustry filmIndustry=new FilmIndustry("The Hindu",3.50f);

String nm=filmIndustry.name;
System.out.println(nm);
float price=filmIndustry.price;
System.out.println(price);
FilmIndustryLang lang= filmIndustry.lang;
System.out.println(lang);
String header=filmIndustry.title;
System.out.println(header);
int film=filmIndustry.noOfFilm;
System.out.println(film);

filmIndustry.lang=FilmIndustryLang.ENGLIGH;
lang=filmIndustry.lang;
System.out.println(lang);

filmIndustry.noOfFilm=12;
System.out.println(filmIndustry.noOfFilm);

FilmIndustry Film=new FilmIndustry();
System.out.println(Film.name);
System.out.println(Film.price);

}
}