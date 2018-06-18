package database.DAO

import com.typesafe.config.ConfigFactory
import slick.jdbc.PostgresProfile.api._


object Connection {

  def postgresDB = {
      val configNamespace = "com.david.herdingcats"
      val mergedCfg = ConfigFactory.load.getConfig(configNamespace)
      val env = "local" //todo: create util function that acquire running environment (script or cmd argument?)
      Database.forConfig(s"$env.postgres")
  }

}
