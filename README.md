##CAR_RENTAL <br>
                                                                          ***SPRING-BOOT-ANGULAR*** <br>

1: https://start.spring.io/ con starter  <br>
2: MySql WorkBench crea il tuo Db con un utente privilegiato e non dimenticare di attivare XAMPP, e inserisci tutte le credenziali nell'application properties <br>
3: Aggiungiamo tutti i package nel BE : Entities , Repositories , Dtos , Controllers , Services , Configurations , Utils , Enums , Resources <br>
4: User Entity - User DTO - User Repository  <br>
5: Auth Service - SignUpRequest DTO - Auth Controller <br>
6: FE : SignUp e Login Component <br>
7: App.component.html <br>
8: Service Auth per SignUp e Login <br>
9: NgZorroimportsModule.ts <br>
10: Aggiungiamo tutte le altre dependecies necessarie <br>
11: utils - JwtUtil <br>
12: UserService <br>
13: Configuration: JwtAuthenticationFilter - WebSecurityConfiguration <br>
14: AuthenticationResponse - AuthenticationRequest <br>
15: FE: storageService <br>
16: FE : module: admin e customer <br>
17: BE : Entity Car , CarImage , CarType - DTO Car, CarImage , CarType <br>
18: BE AdminService - AdminController <br>
19: FE :AdminService & components <br>
20: BE CustomerService - CustomerController <br>
21: FE : CustomerService & components <br>
22: BE : enums BookCarStatus - BookACar Entity - BookACar DTO - BookACarRepository <br>
23: BE : SearchCarDto e CarDtoListDto <br>
<br>

Ora avvia : <br>
FE : npm install & ng serve <br>
BE : mvn clean package , java -jar : file jar <br>


