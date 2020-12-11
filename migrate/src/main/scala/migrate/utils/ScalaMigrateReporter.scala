package migrate.utils

import xsbti.Position
import xsbti.Reporter

case object ScalaMigrateReporter extends Reporter {
  def reset(): Unit                             = ()
  def hasErrors: Boolean                        = false
  def hasWarnings: Boolean                      = false
  def printWarnings(): Unit                     = ()
  def problems(): Array[xsbti.Problem]          = Array.empty
  def log(problem: xsbti.Problem): Unit         = scribe.info("\n" + problem.rendered().get)
  def comment(pos: Position, msg: String): Unit = ()
  def printSummary(): Unit                      = ()
}
