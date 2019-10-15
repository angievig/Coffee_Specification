/*
 * generated by Xtext 2.12.0
 */
package com.coffee.parser.antlr;

import com.coffee.parser.antlr.internal.InternalHlvlParser;
import com.coffee.services.HlvlGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class HlvlParser extends AbstractAntlrParser {

	@Inject
	private HlvlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalHlvlParser createParser(XtextTokenStream stream) {
		return new InternalHlvlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public HlvlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(HlvlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
