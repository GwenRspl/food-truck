import { TestBed } from '@angular/core/testing';

import { ActualiteService } from './actualites.service';

describe('ActualiteService', () => {
  let service: ActualitesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ActualiteService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
