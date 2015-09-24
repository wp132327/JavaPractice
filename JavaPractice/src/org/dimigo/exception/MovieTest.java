/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *	|_ MovieTest
 * 
 * 1. 개요:
 * 2. 작성일: 2015. 9. 23.
 * </pre>
 *
 * @author	: 임예나
 * @version	: 1.0
 */
public class MovieTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			Movie[] movies = {
					new Movie("앤트맨", 12),
					new Movie("사도", 12),
					new Movie("베테랑", 15)
			};
			
			int age = 13;
			for(Movie movie : movies) {
				try {
					buyTicket(movie, age);
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}

	}
	
	private static void buyTicket(Movie movie, int age) throws Exception {
		if(age < movie.getLimitAge()) {
			throw new AgeCheckException(movie);
		} else {
			System.out.println(movie.getTitle() + " 영화 즐감하세요~");
		}
	}

}