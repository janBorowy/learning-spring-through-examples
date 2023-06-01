package pl.student.web_scopes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@AllArgsConstructor
@NoArgsConstructor
public class Foo {

    @Getter
    private int myVal = 0;

    public String foo() {
        return "foo";
    }

    public int incrementVal() {
        return ++myVal;
    }
}
