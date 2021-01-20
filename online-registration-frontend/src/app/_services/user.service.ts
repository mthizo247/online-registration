import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';

import {User} from '../_models';
import {environment} from "../environment";

@Injectable({providedIn: 'root'})
export class UserService {
    constructor(private http: HttpClient) {
    }

    getAll() {
        return this.http.get<User[]>(`${environment.appUrl}/persons`);
    }

    register(user: User) {
        return this.http.post(`${environment.appUrl}/persons`, user);
    }
}