package api.test.data.Response;

public class JokeResponse {
	// JokeResponse

	private String type;

	private String setup;
	private String punchline;
	private int id;

	// Getters and setters (you can generate them using your IDE)

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSetup() {
		return setup;
	}

	public void setSetup(String setup) {
		this.setup = setup;
	}

	public String getPunchline() {
		return punchline;
	}

	public void setPunchline(String punchline) {
		this.punchline = punchline;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "JokeResponse{" + "type='" + type + '\'' + ", setup='" + setup + '\'' + ", punchline='" + punchline
				+ '\'' + ", id=" + id + '}';
	}
}
