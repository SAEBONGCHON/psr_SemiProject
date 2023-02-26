package kh.member.model.vo;

public class MemberVO {
//	tbUser(
//			userid varchar2(30) primary KEY,
//			userpw varchar2(30) NOT NULL,
//			nickname varchar(30) NOT NULL,
//			useremail varchar (30) NOT NULL
	private String userid;
	private String userpw;
	private String nickname;
	private String useremail;
	
	
	@Override
	public String toString() {
		return "MemberVO [userid=" + userid + ", userpw=" + userpw + ", nickname=" + nickname + ", useremail="
				+ useremail + "]";
	}
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MemberVO(String userid, String userpw, String nickname, String useremail) {
		super();
		this.userid = userid;
		this.userpw = userpw;
		this.nickname = nickname;
		this.useremail = useremail;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	
	
	
}