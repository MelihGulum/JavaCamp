
public class stringDemo {

	public static void main(String[] args) {

			String message = "The weather is very nice today. ";
			System.out.println("Character: "+ message.length());
			System.out.println("5. Character: "+ message.charAt(5));
			
			System.out.println(message.concat("Is it?"));
			System.out.println(message.startsWith("w"));
			System.out.println(message.endsWith(" "));
			
			char[] characters = new char[14];
			message.getChars(0, 13, characters, 0);
			System.out.println(characters);

			System.out.println(message.indexOf("w"));
			System.out.println(message.lastIndexOf("y"));
			
			String newMessage = message.replace(" ", "_");
			System.out.println(newMessage);
			
	        System.out.println(message.substring(2, 4));
	        
	        for(String words:message.split(" ")) {
	        	System.out.println(words);
	        }
	        System.out.println(message.toLowerCase());
	        System.out.println(message.toUpperCase());
	        
	        System.out.println(message.trim());
	}

}
