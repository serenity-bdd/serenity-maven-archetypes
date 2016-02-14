#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchBox {
    public static Target SEARCH_FIELD = Target.the("search field").located(By.name("q"));
}
