class Population
{
	public static void main (String [] args)
	{
		long totalSeconds =( 365 * 24 * 60 * 60 )* 5;
		long birth = totalSeconds/7;
		long death = totalSeconds/13;
		long immigrant = totalSeconds/45;
		long population = 312032486;

		long newPopulation = population+birth-death+immigrant;
		System.out.println("Current population:"+population);
		System.out.println("popualtion after five years:"+newPopulation);
	}
}
		




