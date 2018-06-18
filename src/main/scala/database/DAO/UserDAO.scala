package database.DAO

import scala.concurrent.Future
import database.schema.{User, UserRow}
import slick.jdbc.PostgresProfile.api._


class UserDAO {
  private val db = Connection.postgresDB

  def findByUserName(userName: String): Future[Option[User]] = {
    val query = UserRow.filter(_.userName === userName).result.headOption
    db.run(query)
  }

}
