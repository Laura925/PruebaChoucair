#language:es

Característica: Busqueda de convocatorias en la pagina de Choucair Testing

  @EscenariosCorrectos
  Esquema del escenario: Busqueda correcta de convocatorias en Chourcair
    Dado que el usuario abre la aplicacion web de Choucair
    Cuando ingresa la informacion correspondiente al empleo
      | keyword   | location   |
      | <keyword> | <location> |
    Entonces el podra ver la primera convocatoria disponible
    Ejemplos:
      | keyword  | location |
      | Analista |          |
      | Analista | Medellin |
      |          |          |

  @EscenariosFallidos
  Esquema del escenario: Busqueda incorrecta de convocatorias en Chourcair
    Dado que el usuario abre la aplicacion web de Choucair
    Cuando ingresa la informacion correspondiente al empleo
      | keyword   | location   |
      | <keyword> | <location> |
    Entonces el no podra ver informacion referente a la convocatoria
    Ejemplos:
      | keyword | location |
      | ¨*ÑÑp   |          |
      |         | ¨¨+123   |