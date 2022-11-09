package spring.kodlama.io.Devs.business.request.LanguageTechnologyRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateLanguageTechnologyRequest {
	
	private int languageId;
	private String name;
}
