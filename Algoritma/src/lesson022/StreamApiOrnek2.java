package lesson022;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiOrnek2 {

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User("ahmet", 1));
		users.add(new User("aslı", 2));
		users.add(new User("zeynep", 4));
		users.add(new User("deniz", 5));
		users.add(new User("mehmet", 6));
		
		users.stream().forEach(user -> user.bilgileriGoster());
		
		System.out.println("\n* * * * * * *\n");
		
		List<User> idsiUctenBuyukler = users.stream().filter(user -> user.getId() > 3).collect(Collectors.toList());
		
//		idsiUctenBuyukler.forEach(user -> user.bilgileriGoster()); ya da
		
		idsiUctenBuyukler.forEach(User :: bilgileriGoster);
		
		Set<User> uctenKucukler = users.stream().filter(user -> user.getId() < 3).collect(Collectors.toSet());
		
		System.out.println(uctenKucukler);
		
		List<User> yeniUser = users.stream().map( user -> new User (user.getName() + "!!", user.getId())).collect(Collectors.toList());
	
		yeniUser.forEach(User :: bilgileriGoster);
	}
	
}
