package boardV2.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString

public class BoardDto{
    private int bno;
    private String btitle;
    private String bcontent;
    private String bwriter;
    private Date bdate;
}