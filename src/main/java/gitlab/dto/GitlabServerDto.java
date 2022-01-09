package gitlab.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 *
 *
 * @author Lv LiFeng
 * @date 2022/1/7 00:18
 */
@Getter
@Setter
@Accessors(chain = true)
public class GitlabServerDto {

    private String apiUrl = "";
    private String apiToken = "";
    private CloneType preferredConnection = CloneType.SSH;
    private boolean removeSourceBranch = false;

    @Override
    public String toString() {
        return apiUrl;
    }

    public enum CloneType {
        SSH,
        HTTPS;
    }

}
