class Sort { 
	
	public static void main(String[] args) {
		
		
		System.out.println("Unsorted");
		ShowElements(args);
		
		SortElements(args);
		
		System.out.println("Sorted");
		ShowElements(args);
		
	}
	
	public static void SortElements(String[] args) {
		boolean swapped = true;
		String temp = "";
				
		while(swapped) {
			swapped = false;
			for (int j = 0; j < args.length -1; j++) {
				if ((args[j].compareTo(args[j + 1])) > (args[j + 1].compareTo(args[j]))) {
					temp = args[j];
					args[j] = args[j + 1];
					args[j + 1] = temp;
					swapped = true;
				}
			}
		}
	}
	
	public static void ShowElements(String[] args) {
		for (String element : args) {
			System.out.println(element);
		}
	}


}