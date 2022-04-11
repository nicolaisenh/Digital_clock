package week11;

public class book
{
	

class book2{
	
	String title;
	String author;
	int numOfPages;
	String ISBN;

		book2(String tit, String aut, int num)
		{
		title = tit;
		author = aut;
		numOfPages = num;
		ISBN = "unknown";
		}

		book2(String tit, String aut, int num, String isbn)
		{
		title = tit;
		author = aut;
		numOfPages = num;
		isbn = ISBN;
		}
}

}