# TwinSession 26.2

Port de travail de TwinSession pour Minecraft 26.2 / Fabric.

Cible : Java 25, Fabric Loader 0.19.3, Fabric API 0.156.0+26.2.

Le logo original doit être ajouté manuellement dans:
`src/main/resources/assets/twinsession/icon.png`

Le workflow GitHub Actions construit le projet et publie le JAR comme artifact.

IMPORTANT : les Mixins ciblent des méthodes internes de Minecraft. Le build peut nécessiter une adaptation des signatures exactes de 26.2.
