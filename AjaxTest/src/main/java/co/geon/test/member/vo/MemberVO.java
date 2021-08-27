package co.geon.test.member.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberVO {

	private String id;
	private String name;
	private String phone;
	private String addr;
	private String birth;
	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + ", phone=" + phone + ", addr=" + addr + ", birth=" + birth
				+ "]";
	}
	
	
	
}
