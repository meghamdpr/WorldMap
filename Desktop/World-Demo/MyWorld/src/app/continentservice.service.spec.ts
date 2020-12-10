import { TestBed } from '@angular/core/testing';

import { ContinentserviceService } from './continentservice.service';

describe('ContinentserviceService', () => {
  let service: ContinentserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ContinentserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
