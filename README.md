# README - Serveur RMI et Client RMI
## Déroulement

### Serveur RMI (RemoteServiceImpl)
- L'interface `RemoteService` définit les méthodes du service RMI.
- La classe `RemoteServiceImpl` implémente cette interface et étend `UnicastRemoteObject` pour faciliter la communication à distance.
- Le serveur crée un registre RMI sur le port 1099.
- Une instance de `RemoteServiceImpl` est créée et enregistrée sous le nom "RemoteService" dans le registre RMI.

### Client RMI (RmiClient)
- Le client recherche le service distant à l'URL `rmi://localhost:1099/RemoteService`.
- Implicitement, le client obtient le stub correspondant au service distant lors de la recherche.
- Le client invoque la méthode à distance sur le stub local.
- Le stub gère la communication à distance, sérialise les paramètres, envoie la requête, reçoit la réponse, et la renvoie au client.
- Le résultat est affiché par le client.

### Génération de Stubs
- La génération de stubs est implicite grâce à l'utilisation de `UnicastRemoteObject` dans le serveur.

### Localisation du Serveur de Noms RMI et Port
- Le serveur de noms RMI est créé localement sur le port 1099.
