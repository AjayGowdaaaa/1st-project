package test;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Student {
	
	private @Getter @Setter int studID;
    private @Getter @Setter String fName;
    private @Getter @Setter String lName;
}
