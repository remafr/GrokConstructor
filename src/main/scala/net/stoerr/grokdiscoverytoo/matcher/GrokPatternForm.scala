package net.stoerr.grokdiscoverytoo.matcher

import net.stoerr.grokdiscoverytoo.webframe.WebForm

/**
 * @author <a href="http://www.stoerr.net/">Hans-Peter Stoerr</a>
 * @since 17.02.13
 */
trait GrokPatternForm extends WebForm {

  val groklibs = InputMultipleChoice("groklibs")

}
