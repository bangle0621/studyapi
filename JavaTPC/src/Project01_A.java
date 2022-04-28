import java.util.*;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import kr.inflern.BookDTO;

public class Project01_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDTO BookDTO = new BookDTO("길을 걸었지","광수",2000,300); 
		Gson g = new Gson();
		//DTO의 json화
		String json = g.toJson(BookDTO); 
		
		System.out.println(BookDTO.getName());
		System.out.println(json);
		
		//json의 DTO화
		BookDTO json1 = g.fromJson(json, BookDTO.class);
		System.out.println(json1);
		
		List<BookDTO> lst = new ArrayList<BookDTO>();
		lst.add(new BookDTO("길을 걸었지1","광수",2000,300));
		lst.add(new BookDTO("길을 걸었지2","광수",2000,300));
		lst.add(new BookDTO("길을 걸었지3","광수",2000,300));
		lst.add(new BookDTO("길을 걸었지4","광수",2000,300));
		
		String json2 = g.toJson(lst);
		
		System.out.println(json2);
		
		List<BookDTO> lst1 = g.fromJson(json2,new TypeToken<List<BookDTO>>() {}.getType());
		
		for(BookDTO vo: lst1) {
			System.out.println(vo);
		}
		
		
	}

}
