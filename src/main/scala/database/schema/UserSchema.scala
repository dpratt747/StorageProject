package database.schema

import slick.jdbc.PostgresProfile.api._


case object UserRow extends TableQuery(new Users(_))
case class User(username: String, firstname: String, lastname: String, email: Option[String])

class Users(tag: Tag) extends Table[User](tag, "users") {
  def userName = column[String]("username", O.PrimaryKey)
  def firstName = column[String]("firstname")
  def lastName = column[String]("lastName")
  def email = column[Option[String]]("email")
  def * = (userName, firstName, lastName, email) <> (User.tupled, User.unapply)
}

