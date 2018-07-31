package win.yellowpal.mall.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginVo {

	@NotNull
	private String name;

	@NotNull
	@Size(min = 3, max = 16, message = "密碼")
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
