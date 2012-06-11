package ro.redeul.google.go.lang.parser.parsing.statements;

import com.intellij.lang.PsiBuilder;
import com.intellij.psi.tree.IElementType;
import ro.redeul.google.go.lang.parser.GoElementTypes;
import ro.redeul.google.go.lang.parser.GoParser;
import ro.redeul.google.go.lang.parser.parsing.util.ParserUtils;

/**
 * Created by IntelliJ IDEA.
 * User: mtoader
 * Date: Jul 25, 2010
 * Time: 8:07:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class ContinueStatement implements GoElementTypes {
    public static IElementType parse(PsiBuilder builder, GoParser parser) {

        PsiBuilder.Marker marker = builder.mark();

        if (!ParserUtils.getToken(builder, kCONTINUE)) {
            marker.rollbackTo();
            return null;
        }

        ParserUtils.getToken(builder, mIDENT);
        marker.done(CONTINUE_STATEMENT);

        return CONTINUE_STATEMENT;

    }
}
