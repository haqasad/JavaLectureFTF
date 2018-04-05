package com.ftf.lecture.six.bookexample;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Book> booksList = new ArrayList<Book>();
		
		Publisher oxford = new Publisher("Oxford", "NY", "+1(212)726-6000", "custserv.us@oup.com");
		Publisher mchill = new Publisher("Mc-Graw Hill", "NY", "+1(800)338-3987", "hep_customer-service@mheducation.com");
		Publisher wiley = new Publisher("Wiley", "NY", "+1(877)762-2974", "creditriskdept@wiley.com");
		
		ArrayList<String> linearSystemAuthors = new ArrayList<String>();
		linearSystemAuthors.add("B.P. Lathi");
		linearSystemAuthors.add("Roger Green"); 
		Book linearSystems = new Book("Linear Systems and Signals", linearSystemAuthors, oxford, 2017, 
				199.95f, Category.ENGINEERING);
		booksList.add(linearSystems);
		
		ArrayList<String> organicStructureAuthors = new ArrayList<String>();
		organicStructureAuthors.add("Phillip Crews");
		organicStructureAuthors.add("Jaime Rodriguez");
		organicStructureAuthors.add("Marcel Jaspars");
		Book organicStructure = new Book("Organic Structure Analysis", organicStructureAuthors, oxford, 
				2009, 199.95f, Category.SCIENCE);
		booksList.add(organicStructure);
		
		ArrayList<String> jDelinquencyAuthors = new ArrayList<String>();
		jDelinquencyAuthors.add("Robert Agnew");
		jDelinquencyAuthors.add("Timothy Brezina"); 
		Book jDelinquency = new Book("Juvenile Delinquency", jDelinquencyAuthors, oxford, 2017, 107.95f, 
				Category.LAW);
		booksList.add(jDelinquency);
		
		ArrayList<String> mWorldAuthors = new ArrayList<String>();
		mWorldAuthors.add("James Carter");
		mWorldAuthors.add("Richard Warren"); 
		Book mWorld = new Book("Forging the Modern World A History", mWorldAuthors, oxford, 2015, 49.95f, 
				Category.HISTORY);		
		booksList.add(mWorld);
		
		ArrayList<String> sSpeareAuthors = new ArrayList<String>();
		sSpeareAuthors.add("Leonard F. Dean"); 
		Book sSpeare = new Book("Shakespeare Modern Essays in Criticism", sSpeareAuthors, oxford, 1967, 
				69.95f, Category.LITERATURE);
		booksList.add(sSpeare);
		
		ArrayList<String> lMaintenAuth = new ArrayList<String>();
		lMaintenAuth.add("Mandyam Srinivasan");
		lMaintenAuth.add("Melissa R. Bowers");
		lMaintenAuth.add("Kenneth Gilbert");
		Book lMainten = new Book("Lean Maintenance Repair And Overhaul", lMaintenAuth, mchill, 2014, 52.00f, 
				Category.ENGINEERING);
		booksList.add(lMainten);
		
		ArrayList<String> maWorldAuthors = new ArrayList<String>();
		maWorldAuthors.add("David Sobecki");
		maWorldAuthors.add("Brian A. Mercer"); 
		Book maWorld = new Book("Math In Our World: A Quantitative Literacy Approach", 
				maWorldAuthors, mchill, 2016, 153.33f, Category.MATHEMATICS);		
		booksList.add(maWorld);
		
		ArrayList<String> lManAuth = new ArrayList<String>();
		lManAuth.add("Mandyam Srinivasan");
		lManAuth.add("Melissa R. Bowers");
		lManAuth.add("Kenneth Gilbert");
		Book lMan = new Book("Laboratory Manual For General, Organic, And Biological Chemistry", 
				lManAuth, mchill, 2016, 130.33f, Category.SCIENCE);		
		booksList.add(lMan);
		
		ArrayList<String> anEditAuth = new ArrayList<String>();
		anEditAuth.add("Mary H. Maguire");
		anEditAuth.add("Kim Schnurbush"); 
		Book anEdit = new Book("Annual Editions: Drugs, Society, And Behavior", 
				maWorldAuthors, mchill, 2015, 61.33f, Category.HISTORY);
		booksList.add(anEdit);
		
		ArrayList<String> humArtsAuth = new ArrayList<String>();
		humArtsAuth.add("F. David Martin");
		humArtsAuth.add("Lee A Jacobus"); 
		Book humArts = new Book("Humanities Through The Arts", 
				maWorldAuthors, mchill, 2014, 132.72f, Category.LITERATURE);
		booksList.add(humArts);
		
		ArrayList<String> hHumAuth = new ArrayList<String>();
		hHumAuth.add("Robert Andrew Foley"); 
		Book hHum = new Book("Humans Before Humanity", hHumAuth, wiley, 1997, 
				69.95f, Category.LITERATURE);
		booksList.add(hHum);
		
		ArrayList<String> iChemAuth = new ArrayList<String>();
		iChemAuth.add("Geoffrey A. Lawrance"); 
		Book iChem = new Book("Introduction to Coordination Chemistry", iChemAuth, wiley, 2013, 
				64.00f, Category.SCIENCE);
		booksList.add(iChem);
		
		ArrayList<String> sMathAuth = new ArrayList<String>();
		sMathAuth.add("Dieter Rasch");
		sMathAuth.add("Dieter Schott"); 
		Book sMath = new Book("Mathematical Statistics", 
				sMathAuth, wiley, 2018, 80.00f, Category.MATHEMATICS);
		booksList.add(sMath);
		
		ArrayList<String> mMatAuth = new ArrayList<String>();
		mMatAuth.add("Mary H. Maguire");
		mMatAuth.add("Kim Schnurbush"); 
		Book mMat = new Book("Macromolecular Materials and Engineering", 
				mMatAuth, wiley, 2015, 61.33f, Category.HISTORY);
		booksList.add(mMat);
				
		ArrayList<String> sScienceAuth = new ArrayList<String>();
		sScienceAuth.add("Drew Myers"); 
		Book sScience = new Book("Surfactant Science and Technology", sScienceAuth, wiley, 2005, 
				188.00f, Category.ENGINEERING);
		booksList.add(sScience);
		
		for(Book book : booksList) {
			if(book.isPublished()) {
				System.out.println("Book Name: \t" + book.getName() + "\nAuthor: \t" + book.getAuthor() + 
						"\nPublisher: \t" + book.getPublisher().getName() + "\nPrice: \t\t$" + book.getPrice());
				System.out.println("\n"); 
			} else {
				System.out.println("Book Name: \t" + book.getName() + "\nAuthor: \t" + book.getAuthor() + 
						"\nPublisher: \t" + book.getPublisher().getName() + "\nPrice: \t\t$" + book.getPrice());				

				System.out.println("\"" + book.getName() + "\"" + " is out of publication! It was published "
						+ "at " + book.getYear());

				System.out.println("\tContact Publisher: \n\t" + book.getPublisher().getName() + 
						", " + book.getPublisher().getAddress() + "\n\t" + book.getPublisher().getEmail() + 
						"\n\t" + book.getPublisher().getPhone() + "\n"); 
			}
		}		
	}
}
